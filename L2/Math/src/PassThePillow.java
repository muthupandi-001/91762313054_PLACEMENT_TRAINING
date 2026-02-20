class PassThePillow {
    public int passThePillow(int n, int time) {

        int cycle = 2 * (n - 1);
        time = time % cycle;

        if (time < n) {
            return time + 1;
        } else {
            return n - (time - (n - 1));
        }
    }

    static void main() {
        PassThePillow p = new PassThePillow();
        System.out.println(p.passThePillow(4, 5));
    }
}
