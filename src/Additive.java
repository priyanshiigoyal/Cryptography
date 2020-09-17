public class Additive {

    public String Enc(String st,int key){
        String response = "";
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c >= 65 && c <= 92) {
                int a = c - 65;
                int b = (a + key) % 26;
                char t = (char) (b + 65);
                response = response + Character.toString(t);
            }
            if (c >= 97 && c <= 122) {
                int a = c - 97;
                int b = (a + key) % 26;
                char t = (char) (b + 97);
                response = response + Character.toString(t);
            }
        }

        return response;
    }
    public String dec(String data, int key){
        String response = "";
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (c >= 65 && c <= 92) {
                int a = c - 65;
                int b = (a - key) % 26;
                char t = (char) (b + 65);
                response = response + Character.toString(t);
            }
            if (c >= 97 && c <= 122) {
                int a = c - 97;
                int b = (a - key) % 26;
                char t = (char) (b + 97);
                response = response + Character.toString(t);
            }

        }
        return response;
    }

}
