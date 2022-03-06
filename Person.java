class Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.speak("男性");
        person2.speak("女性");
    }

    public void speak(String gender) {
        if (gender.equals("男性")) {
            System.out.println("I\'m a man");
        } else {
            System.out.println("I\'m a woman");
        }
    }
}