package storagerentteam;

public class StorageDeleted extends AbstractEvent {

    private Long storageId;
    private String storageStatus;
    private String description;
    private Float price;
    private Long reviewCnt;
    private String lastAction;

    public Long getRoomId() {
        return storageId;
    }

    public void setRoomId(Long storageId) {
        this.storageId = storageId;
    }
    public String getStatus() {
        return storageStatus;
    }

    public void setStatus(String storageStatus) {
        this.storageStatus = storageStatus;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    public Long getReviewCnt() {
        return reviewCnt;
    }

    public void setReviewCnt(Long reviewCnt) {
        this.reviewCnt = reviewCnt;
    }
    public String getLastAction() {
        return lastAction;
    }

    public void setLastAction(String lastAction) {
        this.lastAction = lastAction;
    }
}