public class Decipherer {

    public static String decipher(String message) {
        // Calcule la longueur de la chaîne et divise-la par 2 pour obtenir le "chiffre-clé"
        int key = message.length() / 2;
        
        // Récupère la sous-chaîne de la longueur du chiffre-clé, en commençant à partir du 6ème caractère
        String subMessage = message.substring(5, 5 + key);
        
        // Remplace les chaînes '@#?' par un espace
        String replacedMessage = subMessage.replace("@#?", " ");
        
        // Inverse la chaîne de caractères
        String reversedMessage = new StringBuilder(replacedMessage).reverse().toString();
        
        return reversedMessage;
    }

    public static void main(String[] args) {
        String[] messagesArray = {
            "0@sn9sirppa@#?ia'jgtvryko1",
            "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
            "aopi?sedohtém@#?sedhtmg+p9l!"
        };

        for (String message : messagesArray) {
            String decipheredMessage = decipher(message);
            System.out.println(decipheredMessage);
        }
    }
}
