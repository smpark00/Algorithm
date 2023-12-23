class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            boolean match = true;

            for (int j = 0; j < pat.length(); j++) {
                if (myString.charAt(i + j) != pat.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return 1;
            }
        }

        return 0;
    }
}
