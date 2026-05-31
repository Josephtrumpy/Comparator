public class GradeComparator implements Comparator<IncomingStudent> {
    @Override
    public int compare(IncomingStudent a, IncomingStudent b) {
        return Integer.compare(a.getGrade(), b.getGrade());
    }
}
