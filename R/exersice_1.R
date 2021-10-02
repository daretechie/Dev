X <- c(1:4)
Y <- c(5:8)

M <- cbind(X, Y)
Q <- rbind(X, Y)


M1 <- matrix(M, nrow = 4, ncol = 2)
rownames(M1) <- c('row1', 'row2', 'row3', 'row4')
colnames(M1) <- c('col1', 'col2')

Q1 <- matrix(Q, nrow = 2, ncol = 4, byrow = TRUE)
rownames(Q1) <- c('row1', 'row2')
colnames(Q1) <- c('col1', 'col2', 'col3', 'col4')

X

Y

M

Q

M1

Q1
