class Solution13 {

    public static int romanToInt(String s) {
        int solution = 0;
        char[] romans = s.toCharArray();
        boolean lastchar = false;
        for (int i = 0; i < romans.length; i++) {
            if (i == romans.length - 1) lastchar = true;
            switch (romans[i]) {
                case 'M':
                    solution += 1000;
                    break;
                case 'D':
                    solution += 500;
                    break;
                case 'C': {
                    if (!lastchar) {
                        if (romans[i + 1] == 'D') {
                            solution += 400;
                            i++;
                        } else if (romans[i + 1] == 'M') {
                            solution += 900;
                            i++;
                        } else solution += 100;
                    } else solution += 100;
                    break;
                }
                case ('L'):
                    solution += 50;
                    break;
                case ('X'): {
                    if (!lastchar) {
                        if (romans[i + 1] == 'L') {
                            solution += 40;
                            i++;
                        } else if (romans[i + 1] == 'C') {
                            solution += 90;
                            i++;
                        } else solution += 10;
                    } else solution += 10;
                    break;
                }
                case 'V':
                    solution += 5;
                    break;
                case 'I': {
                    if (!lastchar) {
                        if (romans[i + 1] == 'V') {
                            solution += 4;
                            i++;
                        } else if (romans[i + 1] == 'X') {
                            solution += 9;
                            i++;
                        } else solution += 1;
                    } else solution += 1;
                    break;
                }
            }
        }
        return solution;
    }
}
