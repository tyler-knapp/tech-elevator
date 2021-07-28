<template>
  <div>
      <h1>Home</h1>
      <best-seller-list />
      <new-releases-list />
  </div>
</template>

<script>
import BestSellerList from '@/components/BestSellerList'
import NewReleasesList from '../components/NewReleasesList.vue'
export default {
    components:{
        BestSellerList,
        NewReleasesList
    }

}
</script>

<style>

</style>