plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.my_test_messenger"
    compileSdk = 34
    viewBinding.isEnabled = true

    defaultConfig {
        applicationId = "com.example.my_test_messenger"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildToolsVersion = "34.0.0"
}

dependencies {
    implementation("com.mikepenz:materialdrawer:7.0.0")

    // CircleImageView
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //required support lib modules
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("androidx.annotation:annotation:1.7.1")
    implementation ("com.google.android.material:material:1.11.0") // requires at least 1.5.0-x
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    // Add for NavController support
    implementation ("com.mikepenz:materialdrawer-nav:7.0.0")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}