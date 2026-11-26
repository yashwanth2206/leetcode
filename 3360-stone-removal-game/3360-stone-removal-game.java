class Solution {
    public boolean canAliceWin(int n) {
        int s = 10;
        boolean alice = true;

        while (n >= s) {
            n = n - s;
            s--;

            alice = !alice;
        }

        return !alice;
    }
}