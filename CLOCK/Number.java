public class Number {
    int n;
    int limit;

    void Number(int limit) {
        this.limit = limit;
    }

    void setNumber(int n) {
        if (n < limit || n > 0) {
            this.n = n;
        }
    }

    int getNumber() {
        return n;
    }

    String getTNumber() {
        if (n < 10)
            return "0" + n;
        else {
            return " " + n;
        }

    }

    void increment() {
        if (n >= 59) {
            n = 0;
        } else {
            n++;
        }
    }

    String getCondition() {
        if (n<12) {
            return "A.M" ;
        } else {
            return "P.M";
        }
    }
}
