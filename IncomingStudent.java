public int compareTo(IncomingStudent other) {
    String studentName = name;
    String otherName = other.getName();

    int minLength = Math.min(studentName.length(), otherName.length());

    for (int lcv = 0; lcv < minLength; lcv++) {
        char c1 = studentName.charAt(lcv);
        char c2 = otherName.charAt(lcv);

        if (c1 != c2) {
            return c1 - c2;
        }
    }

    return studentName.length() - otherName.length();
}