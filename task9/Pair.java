package task9;

public class Pair<T, U>  {

        private T id;
        private U name;

        
        public Pair(T first, U second) {
            this.id = first;
            this.name = second;
        }

    public void setId(T id) {
        this.id = id;
    }

    public void setName(U name) {
        this.name = name;
    }

    public T getId() {
            return id;
        }

        public U getName() {
            return name;
        }
        @Override
        public String toString() {
            return "Id=" +id + ", Name=" + name;
        }
}
