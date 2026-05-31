public class GpaComparator implements Comparator<IncomingStudent> {
    @Override
    public int compare(IncomingStudent a, IncomingStudent b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }
}