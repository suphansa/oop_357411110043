package oop_lab8;

public class Dog extends pet{

        private String breed;

        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        @Override
        public void makeNoise() {
            System.out.println("")
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "breed='" + breed + '\'' +
                    '}'+super.toString();
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }
}//class
