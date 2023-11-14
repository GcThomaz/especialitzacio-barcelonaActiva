package S1_javaLanguage.S1_06.EXercici_1;

public class NoGenericsMethods<T> {
        private T object1;
        private T object2;
        private T object3;

    public NoGenericsMethods(T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

        public void storeObject(T obj) {
            this.object1 = obj;
            this.object2 = obj;
            this.object3 = obj;
        }

        public T retrieveObject() {
            return this.object1;
        }

        public static void main(String[] args) {
            NoGenericsMethods<String> myObj = new NoGenericsMethods<>("Object1", "Object2", "Object3");

            NoGenericsMethods<String> myObj2 = new NoGenericsMethods<>("Object3", "Object1", "Object2");

            myObj.storeObject("NewObject");
            String retrievedObject = myObj.retrieveObject();
            System.out.println("Object recovered: " + retrievedObject);
        }
    }
