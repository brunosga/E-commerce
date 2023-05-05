# Mobile Apps 1 Project

- Student Name: Bruno de Souza Guimarães Almeida
- Student ID: 24845
- Course: BSC in Science in Computing (Year 2)

## Requirement Checklist

- [X] 1. Authentication
    - [X] 1.1. Allow User to Signup
    - [X] 1.2. Log In using username and password
    - [X] 1.3. Store userID once logged in to keep the user logged in (even after restarting the app)
- [X] 2. Product Listing
    - [X] 2.1. List Product Categories
    - [X] 2.2. On clicking a Category, list Products in that Category
    - [X] 2.3. On clicking a Product, show Product description, show buy button and controls to change quantity.
- [X] 3. Cart
    - [ ] 3.1. Show cart summary
    - [ ] 3.2. Show total amount
    - [ ] 3.3. Purchase button to place an order, show order notification
- [ ] 4. Show order history
    - [ ] 4.1. List users orders
    - [ ] 4.2. On clicking an Order, show Order details and Products ordered
    - [ ] 4.3. On clicking a Product, take them to Product description page created for 2.3
- [ ] 5. Show User details
    - [ ] 5.1. Use the stored userID to show user details
    - [ ] 5.2. Show a random circular profile image
    - [ ] 5.3. Show Logout button, on click take back to Signup / Log In page (Restart should not auto login after logout)
- [X] 6. UI/Implementational Requirements
    - [X] 6.1. RecyclerView used for all Lists: Categories, Products, Orders
    - [ ] 6.2. If logged in, attach authentication token to all requests until logout
    - [ ] 6.3. Add a small "About this app" button in the profile page, that shows a page on click with your copyright details and credits
- [ ] 7. Bonus
    - [X] 7.1. ViewPager2 with bottom TabLayout for: Shop, Cart, Orders, Profile icons
    - [ ] 7.2. Show a map fragment based on the GPS co-ordinates in the user profile


## Report

This project was way harder than the previous one, I found it very challenging,
I tried to do the way you showed us in the class but that didn't led me anywhere,
I got stuck o the login page, I was kinda able to do something else but i was only getting errors,
so I decided to do in a different way, I ended up doing a new project using a real database, Firebase,
which I will have to say that was not an easy task as well but I felt more confident doing it,
because there is a lot of tutorials and documentation about it, whereas using postman and a fake database I couldn't find much,
even my classmates were struggling with it, so I focused on the Firebase project and I was able to do most of the requirements.
I know that I was going to finish every single requirement but I had an issue with the cart,
it was working fine but at some point when I had to add "observe" to the CartFragment, line 37, it started to give me an error,
it was saying that the "observe" was not a function, I tried to fix it but I couldn't, I tried to do it in a different way but it didn't work,
so as I didn't have much time left I decided to leave it like that, so I just "fixed" to don't give any main errors.
As I knew the cart was not going to work I focused on the other requirements.
once I was done with the requirements, I did what I like to do best which is the UI, I tried to make it as good as I could, within the time I had,
I designed the logo and made up a name for the store "Nerd Action", which is an action figure store,
I got all of the images from a real store, Iron Studios, that i already had bought from, I also got the description of the products from there,
I know that I could have done a better job but I knew I didn't have much time left.
I hope you understand and I hope you like it.

## References and Credits

1. Iron Studios [Link](https://www.ironstudios.eu)
2. SmoothBottomBar. URL: [Link](https://github.com/ibrahimsn98/SmoothBottomBar)
3. Navigation. URL: [Link](https://developer.android.com/jetpack/androidx/releases/navigation)
4. ImageSlideshow. URL: [Link](https://github.com/denzcoskun/ImageSlideShow)
5. Room. URL: [Link](https://developer.android.com/jetpack/androidx/releases/room)
6. Papaya Coders - YouTube. URL: [Link](https://www.youtube.com/@PapayaCoders)
7. kotlinx.coroutines. URL: [Link](https://github.com/Kotlin/kotlinx.coroutines)
8. Save data in a local database using Room. URL: [Link](https://developer.android.com/training/data-storage/room)
9. Authenticate with Firebase. URL: [Link](https://firebase.google.com/docs/auth/android/phone-auth)

## APK Releases

1. E-Commerce-2.0 [link](https://github.com/brunosga/E-commerce/releases/tag/App_E_Commerce2.0)