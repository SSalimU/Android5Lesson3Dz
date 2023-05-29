// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.4.2" apply false
    id ("com.android.library") version "7.4.2" apply false
    kotlin ("android") version "1.8.20" apply false
    //Hilt
    id ("com.google.dagger.hilt.android") version "2.45" apply false
    //Safeargs
    id ("androidx.navigation.safeargs") version "2.5.3" apply false
    id("org.jetbrains.kotlin.jvm") version "1.8.20" apply false
}