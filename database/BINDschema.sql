/* For MySQL database */
drop database if exists BINDDB;

create database BINDDB;

USE BINDDB;

CREATE TABLE Domain (
    domainName VARCHAR(40) NOT NULL,
    class VARCHAR(20),
    adminContact VARCHAR(40),
    serial INTEGER,
    refresh INTEGER,
    retry INTEGER,
    expire INTEGER,
    ttl INTEGER,
    PRIMARY KEY (domainName)
);

CREATE TABLE NameServer (
    hostname VARCHAR(40) NOT NULL,
    ttl INTEGER,
    class VARCHAR(20),
    ipAddress VARCHAR(20),
    PRIMARY KEY (hostname)
);

CREATE TABLE DNSHosting (
    id INTEGER NOT NULL AUTO_INCREMENT,
    domain VARCHAR(40),
    nameServer VARCHAR(40),
    type VARCHAR(20),
    allowQuery BOOLEAN,
    allowUpdate BOOLEAN,
    allowTransfer BOOLEAN,
    PRIMARY KEY (id),
    CONSTRAINT FOREIGN KEY (domain) REFERENCES Domain(domainName),
    CONSTRAINT FOREIGN KEY (nameServer) REFERENCES NameServer(hostname)
);

/* resourceRecordType Acts as a discriminator for all types of RR*/
CREATE TABLE ResourceRecord (
    id INT NOT NULL AUTO_INCREMENT,
    resourceRecordType VARCHAR(3) NOT NULL, 
    ttl INT,
    hostname VARCHAR(40),
    classOfData VARCHAR(20),
    type VARCHAR(20),
    preference INT,
    srv BOOLEAN,
    name VARCHAR(20),
    service VARCHAR(20),
    protocol VARCHAR(20),
    weight INT,
    port INT,
    nickname VARCHAR(40),
    information VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE DomainData (
    id INT NOT NULL AUTO_INCREMENT,
    domain VARCHAR(40),
    resourceRecord INT,
    PRIMARY KEY (id),
    CONSTRAINT FOREIGN KEY (domain) REFERENCES Domain(domainName),
    CONSTRAINT FOREIGN KEY (resourceRecord) REFERENCES ResourceRecord(id)
);

CREATE TABLE Network (
    id INT NOT NULL AUTO_INCREMENT,
    networkAddr VARCHAR(20),
    netname VARCHAR(40),
    version VARCHAR(30),
    PRIMARY KEY (id)
);

CREATE TABLE Subnet (
    id INT NOT NULL AUTO_INCREMENT,
    subname VARCHAR(40),
    subnetMask VARCHAR(20),
    location VARCHAR(40),
    subnetAddr VARCHAR(20),
    network INT,
    PRIMARY KEY (id),
    CONSTRAINT FOREIGN KEY (network) REFERENCES Network(id)
);

CREATE TABLE IPAddress (
    id INT NOT NULL AUTO_INCREMENT,
    address VARCHAR(20) NOT NULL,
    version VARCHAR(4),
    type VARCHAR(10),
    subnet INT,
    PRIMARY KEY (id),
    CONSTRAINT FOREIGN KEY (subnet) REFERENCES Subnet(id)
);

CREATE TABLE IPAssignment (
    id INT NOT NULL AUTO_INCREMENT,
    fandRMapping INT,
    ipAddress INT,
    PRIMARY KEY (id),
    CONSTRAINT FOREIGN KEY (fandRMapping) REFERENCES ResourceRecord(id),
    CONSTRAINT FOREIGN KEY (ipAddress) REFERENCES IPAddress(id)
);

INSERT INTO Domain (domainName, class, adminContact, serial) VALUES
('bcs.com', 'IN', 'bcs.mail.com', '2013030201');

INSERT INTO NameServer (hostname, ipAddress, class) VALUES
('maci03.bcs.com.', '192.168.1.110', 'IN');

INSERT INTO DNSHosting (domain, nameServer, type, allowQuery, allowUpdate, allowTransfer)
VALUES ('bcs.com', 'maci03.bcs.com.', 'master', false, false, false);

INSERT INTO ResourceRecord (resourceRecordType, hostname, classOfData, type)
VALUES ('FRM', 'maci03.bcs.com.', 'IN', 'A');

INSERT INTO IPAddress (address, version, type) VALUES
('192.168.1.110', 'IPv4', 'static');

INSERT INTO IPAssignment (fandRMapping, ipAddress) VALUES (1, 1);
