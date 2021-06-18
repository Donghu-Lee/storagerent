<template>

<v-data-table
    :headers="headers"
    :items="storageview"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'Storageview',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "desc", value: "desc" },
            { text: "roomStatus", value: "roomStatus" },
            { text: "reservationId", value: "reservationId" },
            { text: "rsvStatus", value: "rsvStatus" },
            { text: "payId", value: "payId" },
            { text: "payStatus", value: "payStatus" },
            { text: "reviewCnt", value: "reviewCnt" },
            { text: "price", value: "price" },
        ],
        storageview : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/storageviews')

      this.storageview = temp.data._embedded.storageviews;

    },
    methods: {
    }
  }
</script>

