def get_large(item):
    return item[0] if item[0] >= item[1] else item[1]


def get_small(item):
    return item[1] if item[0] >= item[1] else item[0]


def is_bill_too_large_for_wallet(wallet_large, wallet_small, bill_large, bill_small):
    if wallet_small < bill_small or wallet_large < bill_large:
        return True
    return False


def get_bill(a, b):
    return [a, b]


def solution(wallet, bill):
    answer = 0

    wallet_large = get_large(wallet)
    wallet_small = get_small(wallet)

    bill_large = get_large(bill)
    bill_small = get_small(bill)

    while is_bill_too_large_for_wallet(
        wallet_large, wallet_small, bill_large, bill_small
    ):
        bill_large = bill_large // 2
        bill = get_bill(bill_large, bill_small)
        bill_large = get_large(bill)
        bill_small = get_small(bill)

        answer += 1

    return answer


wallet = [50, 50]
bill = [100, 241]
solution(wallet, bill)
