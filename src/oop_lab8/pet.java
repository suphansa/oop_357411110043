package oop_lab8;

public class pet {
        private String name;
        private int age;

        public pet(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public pet(String name, int age) {
            this.name = name;
            this.age = age;
        }
        //
        public abstract void makeNoies();
        @Override
        public String toString() {
            return "Pet{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
}//class
