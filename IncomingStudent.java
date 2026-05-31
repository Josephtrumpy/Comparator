public class IncomingStudent implements Comparable<IncomingStudent> {

    @Override
    public int compareTo(IncomingStudent other) {
        return this.name.compareTo(other.name);
    }
}