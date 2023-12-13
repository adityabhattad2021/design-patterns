# Simple Social Media Platform

## Description
This project is a simple social media platform that demonstrates the use of various design patterns in software development. It includes features such as user management, post creation (text, image, video), and a feed with sorting capabilities.

## Design Patterns Used
- **Observer Pattern:** For notifying followers when a user creates a new post.
- **Factory Method Pattern:** For creating different types of posts.
- **Singleton Pattern:** For managing a single instance of the database connection.
- **Strategy Pattern:** For applying different strategies to sort posts in the feed.
  <br/>
  <br/>
  ![design pattern flow diagram](https://github.com/adityabhattad2021/design-patterns/assets/93488388/c8c426a0-0c82-4a2c-9c32-e8d525738cd0)


## Implementation

### Classes and Their Functions
- **User Class:** Handles user attributes and methods for following, unfollowing, and notifying followers.
- **Post Interface and Subclasses (TextPost, ImagePost, VideoPost):** Define and implement different types of posts.
- **PostFactory Class:** Implements the Factory Method Pattern for post creation.
- **DesignPatternApp Class:** Manages the entire functionality of the social media app and applies sorting strategies before displaying the user feed.
- **SortingStrategy Interface and Subclasses (SortbyUploadTime, SortbyUpvotes):** Define and implement sorting strategies.
- **Database Class:** Implements the Singleton Pattern for database operations.
