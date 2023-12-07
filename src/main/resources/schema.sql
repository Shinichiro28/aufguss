CREATE TABLE IF NOT EXISTS events (
  id INT NOT NULL,
  name VARCHAR(30) NOT NULL,
  date_time DATETIME,
  address VARCHAR(50),
  capacity INT,
  booked INT,
  reservationFlg BOOLEAN,
  soldOutFlg BOOLEAN,
  free VARCHAR(300),
  created_at DATETIME,
  updated_at DATETIME,
  PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS reservations (
  id CHAR(49) NOT NULL,
  event_id INT NOT NULL,
  text TEXT,
  username VARCHAR(30) NOT NULL,
  timestamp TIMESTAMP NOT NULL,
  PRIMARY KEY(id),
  CONSTRAINT fk_department_id
  FOREIGN KEY (event_id)
  REFERENCES events (id)
  ON DELETE CASCADE
);