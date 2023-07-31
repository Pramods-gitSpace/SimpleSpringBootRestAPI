CREATE TABLE IF NOT EXISTS `restapisecurity`.`students` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `score` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;


insert into `restapisecurity`.`students` values(1,"pramod","parupati","pramod@gmail.com",960);
insert into `restapisecurity`.`students` values(2,"vinod","Are","vinnu@gmail.com",687);
insert into `restapisecurity`.`students` values(3,"anvi","katha","anni@gmail.com",710);
insert into `restapisecurity`.`students` values(4,"prudhvi","Are","prud@gmail.com",760);
