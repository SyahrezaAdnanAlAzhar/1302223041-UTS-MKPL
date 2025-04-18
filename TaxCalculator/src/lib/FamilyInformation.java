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
        this.spouseName = spouseName
        this.spouseIdNumber = spouseIdNumber
    }

    public static class Child {
        private String name;
        private String idNumber;

        public Child(String name, String idNumber) {
            this.name = name;
            this.idNumber = idNumber;
        }
    }

    public void addChild(String childName, String childIdNumber) {
		children.add(new Child(name, idNumber));
	}
}