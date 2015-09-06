drop table if exists Transaksi;
drop table if exists petani;
drop table if exists sawah;
create table Transaksi (id_transaksi bigint not null auto_increment, belidari varchar(255), hargabeli integer not null, hargajual integer not null, id_petani bigint not null, tgl_beli_sawah datetime, primary key (id_transaksi));
create table petani (id_petani bigint not null auto_increment, alamat_petani varchar(255), id_sawah bigint not null, nama_petani varchar(255), tgl_member_petani datetime, umur_petani integer not null, primary key (id_petani));
create table sawah (id_sawah bigint not null auto_increment, alamat_sawah varchar(255), id_transaksi bigint not null, luas integer not null, nama_sawah varchar(255), tgl_akte_sawah datetime, primary key (id_sawah));
