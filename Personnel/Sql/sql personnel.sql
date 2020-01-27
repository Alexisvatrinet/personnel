#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Ligue
#------------------------------------------------------------

CREATE TABLE Ligue(
        IDLigue  Int  Auto_increment  NOT NULL ,
        nomLigue Text NOT NULL
	,CONSTRAINT Ligue_PK PRIMARY KEY (IDLigue)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Employé
#------------------------------------------------------------

CREATE TABLE Employe(
        id_employe      Int  Auto_increment  NOT NULL ,
        nomEmploye      Varchar (30) NOT NULL ,
        prenomEmploye   Varchar (30) NOT NULL ,
        pwdEmploye      Varchar (30) NOT NULL ,
        EmailEmploye    Text NOT NULL ,
        date_debut      Date NOT NULL ,
        date_de_fin     Date NOT NULL ,
        IDLigue         Int NOT NULL ,
        IDLigue_Acceder Int
	,CONSTRAINT Employe_PK PRIMARY KEY (id_employe)

	,CONSTRAINT Employe_Ligue_FK FOREIGN KEY (IDLigue) REFERENCES Ligue(IDLigue)
	,CONSTRAINT Employe_Ligue0_FK FOREIGN KEY (IDLigue_Acceder) REFERENCES Ligue(IDLigue)
)ENGINE=InnoDB;

