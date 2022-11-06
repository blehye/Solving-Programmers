package level_1;

public class 성격유형검사하기 {

	public static void main(String[] args) {
		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };
		String result = solution(survey, choices);
		System.out.println(result);
	}

	public static String solution(String[] survey, int[] choices) {
		int rCnt = 0;
		int tCnt = 0;
		int cCnt = 0;
		int fCnt = 0;
		int jCnt = 0;
		int mCnt = 0;
		int aCnt = 0;
		int nCnt = 0;

		String target;
		int plusNum;

		String answer = "";

		for (int i = 0; i < survey.length; i++) {
			if (choices[i] < 4) {
				target = survey[i].substring(0, 1);
				plusNum = 0;
				if (choices[i] == 1) {
					plusNum = 3;
				}
				if (choices[i] == 2) {
					plusNum = 2;
				}
				if (choices[i] == 3) {
					plusNum = 1;
				}
				switch (target) {
				case "R":
					rCnt += plusNum;
					break;
				case "T":
					tCnt += plusNum;
					break;
				case "C":
					cCnt += plusNum;
					break;
				case "F":
					fCnt += plusNum;
					break;
				case "J":
					jCnt += plusNum;
					break;
				case "M":
					mCnt += plusNum;
					break;
				case "A":
					aCnt += plusNum;
					break;
				case "N":
					nCnt += plusNum;
					break;
				}
			}
			if (choices[i] > 4) {
				target = survey[i].substring(1, 2);
				plusNum = choices[i] - 4;

				switch (target) {
				case "R":
					rCnt += plusNum;
					break;
				case "T":
					tCnt += plusNum;
					break;
				case "C":
					cCnt += plusNum;
					break;
				case "F":
					fCnt += plusNum;
					break;
				case "J":
					jCnt += plusNum;
					break;
				case "M":
					mCnt += plusNum;
					break;
				case "A":
					aCnt += plusNum;
					break;
				case "N":
					nCnt += plusNum;
					break;
				}
			}
		}

		if (rCnt >= tCnt) {
			answer += "R";
		} else {
			answer += "T";
		}

		if (cCnt >= fCnt) {
			answer += "C";
		} else {
			answer += "F";
		}

		if (jCnt >= mCnt) {
			answer += "J";
		} else {
			answer += "M";
		}

		if (aCnt >= nCnt) {
			answer += "A";
		} else {
			answer += "N";
		}
		return answer;
	}

}
