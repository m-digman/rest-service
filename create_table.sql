CREATE TABLE `stars` (
 `telescope_id` bigint(20) NOT NULL,
 `star_name` varchar(255) NOT NULL,
 `telescope_longitude` decimal(10,7) NOT NULL,
 `telescope_latitude` decimal(10,7) NOT NULL,
 `telescope_altitude` decimal(11,1) NOT NULL,
 `star_right_ascension` float(4,2) NOT NULL,
 `star_declination` float(4,2) NOT NULL,
 `star_apparent_magnitude` float(4,2) NOT NULL,
 `measurement_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8