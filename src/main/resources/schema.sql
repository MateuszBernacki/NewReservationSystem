CREATE TABLE `NEW_ACCOUNT` (
                               `ID` BIGINT AUTO_INCREMENT PRIMARY KEY,
                               `FIRST_NAME` VARCHAR(15) NOT NULL,
                               `SUR_NAME` VARCHAR(15) NOT NULL,
                               `NEW_LOGIN` VARCHAR(15) NOT NULL,
                               `PASSWORD` VARCHAR(15) NOT NULL,
                               `EMAIL_ADDRESS` VARCHAR(30) NOT NULL,
                               `DATE_OF_BIRTH` time,
                               `CREATION` timestamp
);

CREATE TABLE `RESERVATION` (
                               `ID` BIGINT AUTO_INCREMENT PRIMARY KEY,
                               `ARRIVAL_DATE` DATE NOT NULL,
                               `DEPARTURE_DATE` DATE  NOT NULL,
                               `CREATION` timestamp,
                               `ID_newAccount`BIGINT,
                               FOREIGN KEY (`ID_newAccount`)
                                   REFERENCES `NEW_ACCOUNT` (`ID`)
);