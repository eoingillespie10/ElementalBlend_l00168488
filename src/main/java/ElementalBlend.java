// ElementalBlend.java
public class ElementalBlend {
    private String shardType;
    private boolean isAltarActivated;

    // Constructor
    public ElementalBlend(String shardType) {
        this.shardType = shardType;
        this.isAltarActivated = false;
    }

    // Getter for shardType
    public String getShardType() {
        return shardType;
    }

    // Setter for shardType
    public void setShardType(String shardType) {
        this.shardType = shardType;
    }

    // Getter for isAltarActivated
    public boolean isAltarActivated() {
        return isAltarActivated;
    }

    // Method to activate altar
    public void activateAltar() {
        if (!shardType.isEmpty()) {
            isAltarActivated = true;
        }
    }

    // Method to create a storm
    public String createStorm() {
        if (isAltarActivated) {
            return "Storm created with " + shardType + " shard!";
        } else {
            return "Activate the altar first!";
        }
    }
}
