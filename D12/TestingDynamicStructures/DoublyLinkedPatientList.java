public class DoublyLinkedPatientList {
    private PatientNode first;

    public DoublyLinkedPatientList() {
        first = null;
    }

    public void add(Patient patient) {
        PatientNode newPatient = new PatientNode(patient);
        if (first == null) {
            first = newPatient;
            return;
        }
        PatientNode current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newPatient);
        current.getNext().setPrevious(current);
    }

    public void delete(Patient patient) {
        PatientNode delNode = new PatientNode(patient);
        if (first.getPatient().getName().equals(delNode.getPatient().getName())) {
            first = first.getNext();
            if (first != null) {
                first.setPrevious(null);
            }
            return;
        }
        PatientNode current = first;
        while (current.getNext() != null) {
            if (current.getNext().getNext() != null) {
                if (current.getNext().getPatient().getName().equals(delNode.getPatient().getName())) {
                    current.setNext(current.getNext().getNext());
                    current.getNext().setPrevious(current);
                }
                current = current.getNext();
            } else if (current.getNext().getPatient().getName().equals(delNode.getPatient().getName())) {
                current.setNext(null);
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
        while (current.getNext() != null) {
            current = current.getNext();
            counter++;
        }
        return counter;
    }
}
