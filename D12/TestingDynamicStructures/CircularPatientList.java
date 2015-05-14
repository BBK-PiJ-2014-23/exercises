public class CircularPatientList {
    private PatientNode first;

    public CircularPatientList() {
        first = null;
    }

    public void add(Patient patient) {
        PatientNode newPatient = new PatientNode(patient);
        if (first == null) {
            first = newPatient;
            first.setNext(first);
            return;
        }
        PatientNode current = first;
        while (current.getNext() != first) {
            current = current.getNext();
        }
        current.setNext(newPatient);
        current.getNext().setNext(first);
    }

    public void delete(Patient patient) {
        PatientNode delNode = new PatientNode(patient);
        if (first.getPatient().getName().equals(delNode.getPatient().getName())) {
            if (first.getNext() == first) {
                first = null;
                return;
            }
            PatientNode current = first;
            while (current.getNext() != first) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            first = first.getNext();
            return;
        }
        PatientNode current = first;
        while (current.getNext() != first) {
            if (current.getNext().getNext() != first) {
                if (current.getNext().getPatient().getName().equals(delNode.getPatient().getName())) {
                    current.setNext(current.getNext().getNext());
                }
                current = current.getNext();
            } else if (current.getNext().getPatient().getName().equals(delNode.getPatient().getName())) {
                current.setNext(first);
            } else {
                return;
            }
        }
    }

    public int length() {
        if (first == null) {
            return 0;
        }
        int counter = 1;
        PatientNode current = first;
        while (current.getNext() != first) {
            current = current.getNext();
            counter++;
        }
        return counter;
    }
}
