public class Multiplicative {
    public String Encryption(String st, int key){
        String response = "";
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);

            if (c >= 65 && c <= 92) {
                int a = c - 65;
                int b = (a * key) % 26;
                char t = (char) (b + 65);
                response = response + Character.toString(t);
            }
            if (c >= 97 && c <= 122) {
                int a = c - 97;
                int b = (a * key) % 26;
                char t = (char) (b + 97);
                response = response + Character.toString(t);
            }
        }
        return response;
    }
    public String Decryption(String data, int key) {
        String response = "";
        int c = 0;
        for (int i = 1; i <=Math.min(key, 26); i++) {
            if (key % i == 0 && 26 % i == 0) {
                c++;
            }
        }
        if (c == 1) {
            int r1 = 26;
            int r2 = key;
            int t1 = 0;
            int t2 = 1;
            int t;
            int q=0;
            int r=0;
            while (r1 >1) {
                if(r2!=0){
                    q = r1/r2;
                    r = r1 % r2;
                }
                t = t1 - (q * t2);
                r1 = r2;
                r2 = r;
                t1 = t2;
                t2 = t;
            }
            if (t1 < 0) {
                t1 = t1 + 26;
            }
            for (int i = 0; i < data.length(); i++) {
                char chr = data.charAt(i);

                if (chr >= 65 && chr <= 92) {
                    int a = chr - 65;
                    int b = (a * t1) % 26;
                    char x = (char) (b + 65);
                    response = response + Character.toString(x);
                }
                if (chr >= 97 && chr <= 122) {
                    int a = chr - 97;
                    int b = (a * t1) % 26;
                    char x = (char) (b + 97);
                    response = response + Character.toString(x);
                }
            }
        }
        else{
            response = "Not Possible";
        }
        return response;
    }

}
