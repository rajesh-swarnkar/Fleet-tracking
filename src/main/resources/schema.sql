
-- driver info

CREATE TABLE driver (
    driver_id varchar(11) PRIMARY KEY,
    name varchar(255),
    address varchar(255)
);
-- truck info
CREATE TABLE truck (
    turck_no varchar(12) PRIMARY KEY,
    build_no varchar(255),
    driver_id varchar(11)
   --, FOREIGN KEY (driver_id) REFERENCES driver(driver_id)
);
-- device info
CREATE TABLE device (
    device_id varchar(26) PRIMARY KEY,
    make varchar(255),
    other_info varchar(255),
    turck_no varchar(12)
    --, FOREIGN KEY (truck_no) REFERENCES truck(truck_no)
);

-- CREATE TABLE geo_location (
--     device_id varchar(26),
--     lat varchar(255),
--     lng varchar(255),
--     time timestamp DEFAULT CURRENT_TIMESTAMP
--     --, FOREIGN KEY (device_id) REFERENCES device(device_id)
-- );


-- Now DB for storing the Ruote and polyline to determine the delay...

-- route info

-- CREATE TABLE route (
--     device_id varchar(26),
--     pickup_loc varchar(255),
--     pickup_lat varchar(255),
--     pickup_long varchar(255),
--     delivery_loc varchar(255),
--     delivery_lat varchar(255),
--     delivery_long varchar(255),
--     polyline varchar(255)
-- 	--,FOREIGN KEY (device_id) REFERENCES device(device_id)
-- );

