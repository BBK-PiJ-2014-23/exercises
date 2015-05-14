public class Employees {
    private int[] ids;
    private int currentId;
    private String[] names;
    private int currentName;

    public Employees(int size) {
        ids = new int[size];
        currentId = 0;
        names = new String[size];
        currentName = 0;
    }

    public int getId(int address) {
        return ids[address];
    }

    public String getName(int address) {
        return names[address];
    }

    public int getSize() {
        return ids.length;
    }

    public void setId(int id) {
        if (currentId > ids.length - 1) {
            int[] tmp = new int[ids.length];
            for (int i = 0; i < ids.length; i++) {
                tmp[i] = ids[i];
            }
            ids = new int[ids.length * 2];
            for (int i = 0; i < tmp.length; i ++) {
                ids[i] = tmp[i];
            }
        }
        ids[currentId] = id;
        currentId++;
    }

    public void setName(String name) {
        if (currentName > names.length - 1) {
            String[] tmp = new String[names.length];
            for (int i = 0; i < names.length; i++) {
                tmp[i] = names[i];
            }
            names = new String[names.length * 2];
            for (int i = 0; i < tmp.length; i ++) {
                names[i] = tmp[i];
            }
        }
        names[currentName] = name;
        currentName++;
    }
}