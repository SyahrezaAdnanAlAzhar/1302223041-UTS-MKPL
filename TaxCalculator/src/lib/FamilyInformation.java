package lib;

import java.util.ArrayList;

public class FamilyInformation{
    private String spouseName;
	private String spouseIdNumber;
	private List<Child> children;

    public FamilyInformation(String spouseName, String spouseIdNumber){
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
        this.children = new ArrayList<>();
    }

    public String getSpouseName(){
        return this.spouseName;
    }

    public String getSpouseIdNumber(){
        return this.spouseIdNumber;
    }

    public void setSpouse(String spouseName, String spouseIdNumber){
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
    }

    public static class Child {
        private String name;
        private String idNumber;

        public Child(String name, String idNumber) {
            this.name = name;
            this.idNumber = idNumber;
        }
        public String getName() {
            return name;
        }

        public String getIdNumber() {
            return idNumber;
        }
        public void setName(String name){
            this.name = name;
        }
    }

    public void addChild(String childName, String childIdNumber) {
		children.add(new Child(childName, childIdNumber));
	}

    public String getChildNameById(String idNumber) {
        // Id Child bersifat unique sehingga hanya mereturn 1 name saja
        for (Child child : children) {
            if (child.getIdNumber().equals(idNumber)) {
                return child.getName();
            }
        }
        return null; 
    }

    public List<String> getChildIdByName(String name) {
        // Name child bisa saja sama, sehingga memungkinkan return beberapa id yang berbeda
        List<String> matchingIds = new ArrayList<>();
        for (Child child : children) {
            if (child.getName().equalsIgnoreCase(name)) {
                matchingIds.add(child.getIdNumber());
            }
        }
        return matchingIds;
    }

    public int getNumberOfChildren() {
        return children.size();
    }

    public boolean setChildNameById(String idNumber, String newName) {
        for (Child child : children) {
            if (child.getIdNumber().equals(idNumber)) {
                child.setName(newName);
                return true;
            }
        }
        return false;
    }

    public boolean deleteChildById(String idNumber) {
        return children.removeIf(child -> child.getIdNumber().equals(idNumber));
    }
}