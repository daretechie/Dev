movie <- read.csv("C:/Users/DHREY/R_WorkSpace/ML-with-R/data/Movie_regression.csv")
View(movie)

#Data Preprocessing
summary(movie)
movie$Time_taken[is.na(movie$Time_taken)] <- mean(movie$Time_taken, na.rm = TRUE)

