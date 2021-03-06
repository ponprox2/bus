USE [QLXEBUS]
GO
/****** Object:  Table [dbo].[CHUYENXE]    Script Date: 6/6/2021 1:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CHUYENXE](
	[MaChuyenXe] [int] NOT NULL,
	[MaNV] [nvarchar](10) NOT NULL,
	[NgayChay] [date] NOT NULL,
	[TGXuatBen] [time](7) NOT NULL,
	[TGNhapBen] [time](7) NOT NULL,
	[BienSoXe] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_CHUYENXE] PRIMARY KEY CLUSTERED 
(
	[MaChuyenXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LOAIVE]    Script Date: 6/6/2021 1:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAIVE](
	[MaLoaiVe] [int] NOT NULL,
	[Loaive] [nvarchar](10) NOT NULL,
	[Giave] [int] NULL,
 CONSTRAINT [PK_LOAIVE_1] PRIMARY KEY CLUSTERED 
(
	[MaLoaiVe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 6/6/2021 1:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[MaNV] [nvarchar](10) NOT NULL,
	[TenNV] [nvarchar](25) NOT NULL,
	[CMND] [nvarchar](15) NOT NULL,
	[GioiTinh] [nvarchar](5) NOT NULL,
	[DienThoai] [nvarchar](12) NOT NULL,
	[TaiKhoan] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_NHANVIEN] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TAIKHOAN]    Script Date: 6/6/2021 1:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TAIKHOAN](
	[TaiKhoan] [nvarchar](10) NOT NULL,
	[MatKhau] [nvarchar](20) NOT NULL,
	[MaVaiTro] [int] NOT NULL,
 CONSTRAINT [PK_USER] PRIMARY KEY CLUSTERED 
(
	[TaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TRAM]    Script Date: 6/6/2021 1:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TRAM](
	[MaTram] [int] NOT NULL,
	[TenTram] [nvarchar](50) NULL,
 CONSTRAINT [PK_TRAM] PRIMARY KEY CLUSTERED 
(
	[MaTram] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[VAITRO]    Script Date: 6/6/2021 1:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VAITRO](
	[MaVaiTro] [int] NOT NULL,
	[VaiTro] [nvarchar](15) NOT NULL,
 CONSTRAINT [PK_ROLE] PRIMARY KEY CLUSTERED 
(
	[MaVaiTro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[VEXE]    Script Date: 6/6/2021 1:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VEXE](
	[MaVe] [int] NOT NULL,
	[MaChuyenXe] [int] NOT NULL,
	[ThoiGian] [time](7) NOT NULL,
	[MaLoaiVe] [int] NOT NULL,
	[MaTram] [int] NULL,
 CONSTRAINT [PK_VEXE] PRIMARY KEY CLUSTERED 
(
	[MaVe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[XE]    Script Date: 6/6/2021 1:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[XE](
	[BienSoXe] [nvarchar](50) NOT NULL,
	[TenXe] [nvarchar](50) NOT NULL,
	[SoGhe] [int] NOT NULL,
	[TuyenXe] [int] NULL,
 CONSTRAINT [PK_XE] PRIMARY KEY CLUSTERED 
(
	[BienSoXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (1, N'NV01', CAST(N'2021-09-04' AS Date), CAST(N'06:00:00' AS Time), CAST(N'08:37:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (2, N'NV02', CAST(N'2021-09-04' AS Date), CAST(N'06:30:00' AS Time), CAST(N'09:03:00' AS Time), N'51B - 32769
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (3, N'NV01', CAST(N'2021-10-04' AS Date), CAST(N'06:00:00' AS Time), CAST(N'08:37:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (4, N'NV03', CAST(N'2021-10-04' AS Date), CAST(N'07:00:00' AS Time), CAST(N'09:35:00' AS Time), N'51B - 98565
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (5, N'NV04', CAST(N'2021-11-04' AS Date), CAST(N'06:45:00' AS Time), CAST(N'09:12:00' AS Time), N'51B - 84756
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (6, N'NV05', CAST(N'2021-11-04' AS Date), CAST(N'07:15:00' AS Time), CAST(N'09:48:00' AS Time), N'51B - 72384
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (7, N'NV06', CAST(N'2021-04-05' AS Date), CAST(N'07:15:00' AS Time), CAST(N'09:48:00' AS Time), N'51B - 62754')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (8, N'NV06', CAST(N'2021-04-06' AS Date), CAST(N'09:30:00' AS Time), CAST(N'10:55:00' AS Time), N'51B - 62754')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (9, N'NV06', CAST(N'2021-04-07' AS Date), CAST(N'09:30:00' AS Time), CAST(N'10:55:00' AS Time), N'51B - 62754')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (10, N'NV06', CAST(N'2021-05-09' AS Date), CAST(N'10:00:00' AS Time), CAST(N'12:30:00' AS Time), N'51B - 62754')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (11, N'NV01', CAST(N'2021-05-09' AS Date), CAST(N'21:29:00' AS Time), CAST(N'23:59:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (12, N'NV01', CAST(N'2021-05-09' AS Date), CAST(N'21:29:00' AS Time), CAST(N'23:59:00' AS Time), N'51B - 32769
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (13, N'NV01', CAST(N'2021-05-09' AS Date), CAST(N'09:30:00' AS Time), CAST(N'12:00:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (14, N'NV01', CAST(N'2021-05-09' AS Date), CAST(N'07:20:00' AS Time), CAST(N'09:50:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (15, N'NV01', CAST(N'2021-05-09' AS Date), CAST(N'23:50:00' AS Time), CAST(N'02:20:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (17, N'NV02', CAST(N'2021-05-10' AS Date), CAST(N'11:00:00' AS Time), CAST(N'12:20:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (18, N'NV03', CAST(N'2021-05-10' AS Date), CAST(N'08:00:00' AS Time), CAST(N'09:00:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (19, N'NV04', CAST(N'2021-05-10' AS Date), CAST(N'09:00:00' AS Time), CAST(N'10:00:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (20, N'NV01', CAST(N'2021-05-10' AS Date), CAST(N'11:38:00' AS Time), CAST(N'12:58:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (21, N'NV03', CAST(N'2021-05-10' AS Date), CAST(N'11:57:00' AS Time), CAST(N'13:17:00' AS Time), N'51B - 32769
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (22, N'NV01', CAST(N'2021-05-10' AS Date), CAST(N'17:13:00' AS Time), CAST(N'18:33:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (23, N'NV01', CAST(N'2021-05-10' AS Date), CAST(N'18:45:00' AS Time), CAST(N'19:50:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (24, N'NV01', CAST(N'2021-05-10' AS Date), CAST(N'17:19:00' AS Time), CAST(N'18:39:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (25, N'NV02', CAST(N'2021-05-10' AS Date), CAST(N'17:25:00' AS Time), CAST(N'18:45:00' AS Time), N'51B - 32769
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (26, N'NV03', CAST(N'2021-05-10' AS Date), CAST(N'17:50:00' AS Time), CAST(N'19:10:00' AS Time), N'51B - 62754')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (27, N'NV01', CAST(N'2021-05-11' AS Date), CAST(N'17:20:00' AS Time), CAST(N'18:40:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (28, N'NV01', CAST(N'2021-05-12' AS Date), CAST(N'05:00:00' AS Time), CAST(N'06:00:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (29, N'NV01', CAST(N'2021-05-14' AS Date), CAST(N'15:00:00' AS Time), CAST(N'16:00:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (30, N'NV02', CAST(N'2021-05-14' AS Date), CAST(N'17:00:00' AS Time), CAST(N'18:00:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (31, N'NV01', CAST(N'2021-05-15' AS Date), CAST(N'05:00:00' AS Time), CAST(N'06:00:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (32, N'NV01', CAST(N'2021-05-16' AS Date), CAST(N'15:04:00' AS Time), CAST(N'16:24:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (33, N'NV01', CAST(N'2021-06-03' AS Date), CAST(N'08:47:00' AS Time), CAST(N'10:07:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (34, N'NV01', CAST(N'2021-06-04' AS Date), CAST(N'19:00:00' AS Time), CAST(N'20:20:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (35, N'NV01', CAST(N'2021-06-05' AS Date), CAST(N'15:00:00' AS Time), CAST(N'16:20:00' AS Time), N'51B - 21912
')
INSERT [dbo].[CHUYENXE] ([MaChuyenXe], [MaNV], [NgayChay], [TGXuatBen], [TGNhapBen], [BienSoXe]) VALUES (36, N'NV01', CAST(N'2021-06-06' AS Date), CAST(N'05:49:00' AS Time), CAST(N'07:09:00' AS Time), N'51B - 21912
')
INSERT [dbo].[LOAIVE] ([MaLoaiVe], [Loaive], [Giave]) VALUES (1, N'SINHVIEN', 3000)
INSERT [dbo].[LOAIVE] ([MaLoaiVe], [Loaive], [Giave]) VALUES (2, N'KHACH', 7000)
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [CMND], [GioiTinh], [DienThoai], [TaiKhoan]) VALUES (N'NV01', N'TRAN VAN B', N'227766884', N'NAM', N'0369657844', N'USER1')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [CMND], [GioiTinh], [DienThoai], [TaiKhoan]) VALUES (N'NV02', N'DANG THI B
', N'837465878
', N'NU', N'0875698687
', N'USER2')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [CMND], [GioiTinh], [DienThoai], [TaiKhoan]) VALUES (N'NV03', N'TRAN HUU C
', N'812735454
', N'NAM', N'0793937575
', N'USER3')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [CMND], [GioiTinh], [DienThoai], [TaiKhoan]) VALUES (N'NV04', N'PHAM VAN D
', N'128937317
', N'NAM', N'0875687563
', N'USER4')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [CMND], [GioiTinh], [DienThoai], [TaiKhoan]) VALUES (N'NV05', N'NGUYEN DUC E
', N'198237489
', N'NAM', N'0398475875
', N'USER5')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [CMND], [GioiTinh], [DienThoai], [TaiKhoan]) VALUES (N'NV06', N'AOSDIJ', N'272930687', N'NAM', N'0321654987', N'USER6')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [CMND], [GioiTinh], [DienThoai], [TaiKhoan]) VALUES (N'NV09', N'TRAN VAN C', N'321654988', N'NAM', N'0987654444', N'USER9')
INSERT [dbo].[NHANVIEN] ([MaNV], [TenNV], [CMND], [GioiTinh], [DienThoai], [TaiKhoan]) VALUES (N'QL01', N'LE THI F
', N'392487837
', N'NU', N'0293847292
', N'MANAGER1')
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'MANAGER1', N'123456789', 2)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER1', N'123456', 1)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER2', N'234567', 1)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER3', N'345678', 1)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER4', N'456789', 1)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER5', N'567890', 1)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER6', N'678901', 1)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER7', N'123456', 1)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER8', N'123456', 1)
INSERT [dbo].[TAIKHOAN] ([TaiKhoan], [MatKhau], [MaVaiTro]) VALUES (N'USER9', N'123456', 1)
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (1, N'KHU CONG NGHE CAO')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (2, N'CHUNG CU C6')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (3, N'DAI HOC GTVT')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (4, N'BENH VIEN Q9')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (5, N'CHO TANG NHON PHU B')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (6, N'CHO HIEP PHU')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (7, N'NGA 4 THU DUC')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (8, N'NGA 4 TAY HOA RMK')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (9, N'CAU SAI GON')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (10, N'CONG VIEN PM QUANG TRUNG')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (11, N'CAU DONG NAI')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (12, N'CHO NHO')
INSERT [dbo].[TRAM] ([MaTram], [TenTram]) VALUES (13, N'TRAM MOI')
INSERT [dbo].[VAITRO] ([MaVaiTro], [VaiTro]) VALUES (1, N'NHANVIEN
')
INSERT [dbo].[VAITRO] ([MaVaiTro], [VaiTro]) VALUES (2, N'QUANLY
  ')
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (241, 24, CAST(N'17:29:58' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (271, 27, CAST(N'17:21:07' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (24242, 24, CAST(N'17:30:19' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (27272, 27, CAST(N'17:21:13' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (29961, 3, CAST(N'07:48:12' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (30324, 3, CAST(N'07:48:40' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (58140, 3, CAST(N'07:48:44' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (65099, 3, CAST(N'07:48:42' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (132711, 1, CAST(N'06:32:00' AS Time), 1, 3)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (172732, 4, CAST(N'08:27:00' AS Time), 2, 7)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (183755, 3, CAST(N'07:42:00' AS Time), 1, 4)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (183762, 3, CAST(N'08:17:00' AS Time), 2, 6)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (192832, 5, CAST(N'07:18:00' AS Time), 2, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (254526, 2, CAST(N'06:57:00' AS Time), 1, 3)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (290001, 29, CAST(N'23:01:51' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (290002, 29, CAST(N'23:02:07' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (290003, 29, CAST(N'23:02:10' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (290004, 29, CAST(N'23:02:12' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (290005, 29, CAST(N'23:02:14' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (290006, 29, CAST(N'23:02:20' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (290007, 29, CAST(N'23:02:25' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (300001, 30, CAST(N'23:04:09' AS Time), 1, 5)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (300002, 30, CAST(N'23:55:59' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (300003, 30, CAST(N'23:57:47' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (300004, 30, CAST(N'23:58:02' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (300005, 30, CAST(N'23:58:29' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (300006, 30, CAST(N'23:59:18' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (310001, 31, CAST(N'00:33:54' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (310002, 31, CAST(N'00:34:24' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (310003, 31, CAST(N'00:34:31' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (310004, 31, CAST(N'00:40:51' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (310005, 31, CAST(N'00:45:10' AS Time), 1, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (315001, 31, CAST(N'00:40:57' AS Time), 2, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (315002, 31, CAST(N'00:46:13' AS Time), 2, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (325001, 32, CAST(N'15:04:50' AS Time), 2, 1)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (345001, 34, CAST(N'22:17:49' AS Time), 2, 12)
INSERT [dbo].[VEXE] ([MaVe], [MaChuyenXe], [ThoiGian], [MaLoaiVe], [MaTram]) VALUES (355001, 35, CAST(N'19:10:47' AS Time), 2, 1)
INSERT [dbo].[XE] ([BienSoXe], [TenXe], [SoGhe], [TuyenXe]) VALUES (N'51B - 21912
', N'HUYNDAI
', 20, 55)
INSERT [dbo].[XE] ([BienSoXe], [TenXe], [SoGhe], [TuyenXe]) VALUES (N'51B - 32769
', N'HUYNDAI
', 20, 55)
INSERT [dbo].[XE] ([BienSoXe], [TenXe], [SoGhe], [TuyenXe]) VALUES (N'51B - 62754', N'HUYNDAI', 20, 55)
INSERT [dbo].[XE] ([BienSoXe], [TenXe], [SoGhe], [TuyenXe]) VALUES (N'51B - 72384
', N'HUYNDAI
', 20, 55)
INSERT [dbo].[XE] ([BienSoXe], [TenXe], [SoGhe], [TuyenXe]) VALUES (N'51B - 84756
', N'HUYNDAI
', 20, 55)
INSERT [dbo].[XE] ([BienSoXe], [TenXe], [SoGhe], [TuyenXe]) VALUES (N'51B - 98565
', N'HUYNDAI
', 20, 55)
SET ANSI_PADDING ON

GO
/****** Object:  Index [IX_NHANVIEN]    Script Date: 6/6/2021 1:40:22 PM ******/
ALTER TABLE [dbo].[NHANVIEN] ADD  CONSTRAINT [IX_NHANVIEN] UNIQUE NONCLUSTERED 
(
	[TaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[CHUYENXE]  WITH CHECK ADD  CONSTRAINT [FK_CHUYENXE_NHANVIEN] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NHANVIEN] ([MaNV])
GO
ALTER TABLE [dbo].[CHUYENXE] CHECK CONSTRAINT [FK_CHUYENXE_NHANVIEN]
GO
ALTER TABLE [dbo].[CHUYENXE]  WITH CHECK ADD  CONSTRAINT [FK_CHUYENXE_XE] FOREIGN KEY([BienSoXe])
REFERENCES [dbo].[XE] ([BienSoXe])
GO
ALTER TABLE [dbo].[CHUYENXE] CHECK CONSTRAINT [FK_CHUYENXE_XE]
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD  CONSTRAINT [FK_NHANVIEN_USER] FOREIGN KEY([TaiKhoan])
REFERENCES [dbo].[TAIKHOAN] ([TaiKhoan])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[NHANVIEN] CHECK CONSTRAINT [FK_NHANVIEN_USER]
GO
ALTER TABLE [dbo].[TAIKHOAN]  WITH CHECK ADD  CONSTRAINT [FK_USER_ROLE] FOREIGN KEY([MaVaiTro])
REFERENCES [dbo].[VAITRO] ([MaVaiTro])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[TAIKHOAN] CHECK CONSTRAINT [FK_USER_ROLE]
GO
ALTER TABLE [dbo].[VEXE]  WITH CHECK ADD  CONSTRAINT [FK_VEXE_CHUYENXE] FOREIGN KEY([MaChuyenXe])
REFERENCES [dbo].[CHUYENXE] ([MaChuyenXe])
GO
ALTER TABLE [dbo].[VEXE] CHECK CONSTRAINT [FK_VEXE_CHUYENXE]
GO
ALTER TABLE [dbo].[VEXE]  WITH CHECK ADD  CONSTRAINT [FK_VEXE_LOAIVE] FOREIGN KEY([MaLoaiVe])
REFERENCES [dbo].[LOAIVE] ([MaLoaiVe])
GO
ALTER TABLE [dbo].[VEXE] CHECK CONSTRAINT [FK_VEXE_LOAIVE]
GO
ALTER TABLE [dbo].[VEXE]  WITH CHECK ADD  CONSTRAINT [FK_VEXE_TRAM] FOREIGN KEY([MaTram])
REFERENCES [dbo].[TRAM] ([MaTram])
GO
ALTER TABLE [dbo].[VEXE] CHECK CONSTRAINT [FK_VEXE_TRAM]
GO
