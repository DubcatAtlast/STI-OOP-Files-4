from collections import deque

def main():
    movies = deque()
    snacks = deque()

    print("Enter 3 movies you would like to watch:")
    for _ in range(3):
        movie = input()
        movies.append(movie)

    print("Enter 3 snacks or beverages you would like to enjoy:")
    for _ in range(3):
        snack = input()
        snacks.append(snack)

    print("\nMovies to watch:")
    for movie in movies:
        print(movie)

    print("\nSnacks to enjoy:")
    for snack in snacks:
        print(snack)

    while snacks:
        print("\nType 'S' when done eating a snack:")
        input_text = input()
        if input_text.strip().upper() == 'S':
            snacks.popleft()  # Remove the first snack
            if snacks:
                print("Remaining snacks:")
                for remaining_snack in snacks:
                    print(remaining_snack)
            else:
                print("No more snacks.")

if __name__ == "__main__":
    main()
