package com.withjetpack.bottomnavigationjetpackcompose

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String){

    object Home : BottomNavItem("Home", R.drawable.home,"home")
    object MyNetwork: BottomNavItem("My Network",R.drawable.portfolio,"my_network")
    object AddPost: BottomNavItem("Post",R.drawable.more,"add_post")
    object Notification: BottomNavItem("Notification",R.drawable.active,"notification")
    object Jobs: BottomNavItem("Settings",R.drawable.setting,"settings")
}