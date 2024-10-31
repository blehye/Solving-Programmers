# video_len : 동영상의 길이
# pos : 기능이 수행되기 직전의 재생위치
# op_start : 오프닝 시작 시각
# op_end : 오프닝 끝나는 시각
# commands : 사용자의 입력
# prev : 10초전으로 이동
# next : 10초후로 이동


def checkOpenning(pos, op_start, op_end):
    if pos >= op_start and pos <= op_end:
        return op_end
    return pos


def convertToSecond(time):
    minute = time[:2]
    second = time[3:]

    return (int(minute) * 60) + int(second)


def isFinish(pos, video_len):
    if pos >= video_len:
        return video_len
    return pos


def isStart(pos):
    if pos <= 0:
        return 0
    return pos


def movePos(pos, command, video_len, op_start, op_end):
    if command == "next":
        pos += 10
        pos = isFinish(pos, video_len)
        pos = checkOpenning(pos, op_start, op_end)
        return pos
    if command == "prev":
        pos -= 10
        pos = isStart(pos)
        pos = checkOpenning(pos, op_start, op_end)
        return pos


def convertTimeToStr(time):
    minute = time / 60
    second = time - (int(minute) * 60)
    minute_str = str(int(minute))
    second_str = str(int(second))
    if len(minute_str) == 1:
        minute_str = "0" + minute_str
    if len(second_str) == 1:
        second_str = "0" + second_str

    return minute_str + ":" + second_str


def solution(video_len, pos, op_start, op_end, commands):
    video_len_time = convertToSecond(video_len)
    pos_time = convertToSecond(pos)
    op_start_time = convertToSecond(op_start)
    op_end_time = convertToSecond(op_end)

    # 맨 처음 오프닝 구간인지 확인
    pos_time = checkOpenning(pos_time, op_start_time, op_end_time)

    for command in commands:
        pos_time_change = movePos(
            pos_time, command, video_len_time, op_start_time, op_end_time
        )
        pos_time = pos_time_change

    answer = convertTimeToStr(pos_time)
    return answer


arr = ["prev"]
solution("30:00", "00:08", "00:00", "00:05", arr)
