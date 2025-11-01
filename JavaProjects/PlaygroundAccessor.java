class PlaygroundAccessor {
    public static void main(String[] args) {
        Playground pg = new Playground();
        int age = pg.getAge();
        System.out.println(age);
        pg.setAge(14);
        int newAge = pg.getAge();
        System.out.println(newAge);


    }
}
