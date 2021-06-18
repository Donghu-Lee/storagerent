package storagerentteam;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Storageview_table")
public class Storageview {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String desc;
        private String roomStatus;
        private Long reservationId;
        private String rsvStatus;
        private Long payId;
        private String payStatus;
        private Long reviewCnt;
        private Float price;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
        public String getRoomStatus() {
            return roomStatus;
        }

        public void setRoomStatus(String roomStatus) {
            this.roomStatus = roomStatus;
        }
        public Long getReservationId() {
            return reservationId;
        }

        public void setReservationId(Long reservationId) {
            this.reservationId = reservationId;
        }
        public String getRsvStatus() {
            return rsvStatus;
        }

        public void setRsvStatus(String rsvStatus) {
            this.rsvStatus = rsvStatus;
        }
        public Long getPayId() {
            return payId;
        }

        public void setPayId(Long payId) {
            this.payId = payId;
        }
        public String getPayStatus() {
            return payStatus;
        }

        public void setPayStatus(String payStatus) {
            this.payStatus = payStatus;
        }
        public Long getReviewCnt() {
            return reviewCnt;
        }

        public void setReviewCnt(Long reviewCnt) {
            this.reviewCnt = reviewCnt;
        }
        public Float getPrice() {
            return price;
        }

        public void setPrice(Float price) {
            this.price = price;
        }

}
