<template>
  <div id="addemail">
      <h1>Add Email</h1>
      <div>
          <label for="name">Name: </label>
          <input type="text" id="name" v-model="name">
      </div>
      <div>
          <label for="email">Email: </label>
          <input type="text" id="email" v-model="email">
      </div>
      <div>
          <label for="emailType">EmailType: </label>
          <select id="emailType" v-model="emailType">
            <option vaule="HOME">Home</option>
            <option vaule="WORK">Work</option>
            <option vaule="OTHER">Other</option>
          </select>  
      </div>
  </div>
</template>

<script>
export default {
    name: 'add-email',
    data() {
        return {
            name: '',
            email: '',
            emailType: ''

        }
    }
}
</script>

<style>

</style>