Product <- read.table("C:/Users/DHREY/Desktop/R/Product.txt", header = T, sep = "\t")
str(Product)


Customer <- read.csv("C:/Users/DHREY/Desktop/R/Customer.csv", header = T)
Customer

#We want to know frequency for each region in the customer table
eachRegion <- table(Customer$Region)
eachRegion

#rep the region in bar chart, reorder and colour, also horiz to turn bar
#to see the list of all color in R, use colors(),
barplot(eachRegion[order(-eachRegion)], col = c("red", "khaki", "azure","beige"), border = NA, main = "Frequency of \n Region", xlab = "No of customer")

colors()

hist(Customer$Age, breaks = c(0,40,60,100), freq = T,col=c("blue", "yellow"))
