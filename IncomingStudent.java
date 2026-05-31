public int compareTo(IncomingStudent other) {
    String studentName = name;
    String otherName = other.getName();

    int minLength = Math.min(studentName.length(), otherName.length());

    for (int lcv = 0; lcv < minLength; lcv++) {
        String letterA = studentName.substring(lcv, lcv + 1);
        String letterB = otherName.substring(lcv, lcv + 1);

        if (!letterA.equals(letterB)) {
            return letterA.compareTo(letterB);
        }
    }

    return studentName.length() - otherName.length();
}