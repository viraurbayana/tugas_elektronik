package com.example.elektronik;

import android.content.Context;
import model.Elektronik;
import model.Handphone;
import model.Laptop;
import model.Televisi;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private static List<Elektronik> elektroniks = new ArrayList<>();

    private static List<Handphone> initCoktail(Context ctx) {
        List<Handphone> handphones = new ArrayList<>();
        handphones.add(new Handphone("Iphone 11 Promax", "Applle","Operating System iOS 13\n" +
                "\n" +
                "Prosessor : Chip A13 Bionic\n" +
                "Camera Triple 12MP Ultra Wide, Wide, and Telephoto cameras TrueDepth Camera 12MP camera Sensors Face ID\n" +
                "Kapasitas Baterai : 3500 mAh\n" +
                "Layar : Super Retina XDR display 6.5 Inch (diagonal) all‑screen OLED Multi‑Touch.",R.drawable.h_apple_promax_11));
        handphones.add(new Handphone("Samsung Galaxy A72",
                "Adroid", "• Resolution :1080 x 2400 pixels, 20:9 ratio (~393 ppi density)\n" +
                "• Protection :Unspecified\n" +
                "• OS :Android 11, One UI 3.1\n" +
                "• Chipset :Qualcomm SM7225 Snapdragon 750G (8 nm)\n" +
                "• CPU :Octa-core (2x2.2 GHz Kryo 570 & 6x1.8 GHz Kryo 570)", R.drawable.h_samsung_galaxy_a72));
        handphones.add(new Handphone("OPPO Reno4 F Smartphone","Samatphone","• OS: Android 10, ColorOS 7.2\n" +
                "• Size: 6.43 inches\n" +
                "• Resolution: 1080 x 2400 pixels\n" +
                "• Main Camera : 48MP + 8MP + 2MP + 2MP, Front Camera : 8MP + 2MP\n" +
                "• Battery: Li-Po 4000 mAh", R.drawable.h_oppo));
        handphones.add(new Handphone("Nokia 110 Handphone - Black", "Hanphone","Ukuran layar : 1.8 Inch 128 x 160 piksel (~20.2% screen-to-body ratio)\n" +
                "Memori : RAM 256 MB & internal 10 MB\n" +
                "Terdapat slot micro SD : Up to 32 GB\n" +
                "Keypad alfanumeriknya yang dilapisi karet sehingga nyaman untuk Anda gunakan saat mengetik\n" +
                "Terbuat dari bahan plastik berkualitas pada bagian casing.", R.drawable.h_nokia));
       return handphones;
    }

    private static List<Laptop> initMocktail(Context ctx) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Accer", "Intel", "• Intel® Celeron® processor\n" +
                "• Chrome OS™\n" +
                "• 11.6\" diagonal, HD (1366 x 768), anti-glare, 220 nits, 45% NTSC\n" +
                "• 4 GB LPDDR4-3733 MHz RAM (onboard)\n" +
                "• 32 GB eMMC\n" +
                "• The Chromebook built for schools and designed for learning\n" +
                "• Intel® UHD Graphics 600", R.drawable.l_acer));
        laptops.add(new Laptop("Lenovo", "Intel", "laptop lenovo thinkpad t420 i5 ram 4gb hdd 320gb\n" +
                "Spesifikasi : \n" +
                "- Core i5-2520M @2,50 Ghz \n" +
                "- RAM DDR3 4.0 GB\n" +
                "- HARDISK 320 GB SATA \n" +
                "- LAN/WIFI/USB\n" +
                "- DVDRW/CAR REARDER \n" +
                "- Esata/DVI PORT\n" +
                "- VGA INTEL HD3000 \n" +
                "- LAYAR LED 14.1 INCH \n" +
                "- WINT 7 PRO 64 BIT ORI \n" +
                " \n" +
                "KETERANGAN LAPTOP \n" +
                "- KONDISI NORMAL \n" +
                "- CASING 95- 97 %\n" +
                "-GARANSI DISTRIBUTOR 1BULAN \n" +
                " \n" +
                "BARANG YANG SUDAH DIBELI TIDAK DAPAT DIKEMBALIKAN DANA BILA ADA KEKELIRUAN BOLEH DITUKAR BARANG KEMBALI", R.drawable.l_lenovo));
        laptops.add(new Laptop("Toshiba", "Intel", "Notebook TOSHIBA DYNABOOK C40H /I3-1005G1/4GB/256GB SSD/14\"/WIN 10/\n" +
                "Notebook TOSHIBA DYNABOOK C40H\n" +
                "Intel Core I3-1005G1\n" +
                "DDR 4 4GB\n" +
                "256GB SSD\n" +
                "Layar 14\"\n" +
                "WIN 10 Ori\n" +
                "Garansi Resmi Dari Toshiba Indonesia\n" +
                "Garansi Laptop, Adaptor & Baterai Selama 1th.", R.drawable.l_toshiba));
        laptops.add(new Laptop("HP", "Intel", "HP 14s-cf2516TU Laptop - Silver [N4020 / 14\" LED HD SVA 220 Nits / 4GB / 256GB SSD / UMA / Win10 / OHS 2019 / Backlit KB] FREE Bag\n" +
                "This slim, ultra-portable laptop delivers reliable performance, and makes it easy to stay social, productive, and connected to what matters with a long-lasting battery life. The micro-edge display gives you lots to look at with more screen in a smaller frame.\n" +
                "\n" +
                "Sleek. Slim. Stylish design.\n" +
                "Designed for portability, this lightweight laptop has a micro-edge display with ultra-narrow bezel, giving you lots of screen in a smaller frame.\n" +
                "\n" +
                "Responsive and reliable performance.\n" +
                "With the latest Intel® Core™ processor and a super responsive precision touch pad – you’ve got the power to surf, stream, and do more like never before.\n" +
                "\n" +
                "Stay Connected and Entertained\n" +
                "With long-lasting battery life and fast-charge technology, this laptop lets you work and play all day. Includes hard drive storage to store photos, videos, and music – plus a USB-C™ port ready for the future of connectivity.\n" +
                "\n" +
                "Intel® Celeron N4020 processor\n" +
                "Windows 10 Home 64\n" +
                "14\" diagonal, HD (1366 x 768), micro-edge, BrightView, 220 nits, 45% NTSC\n" +
                "4 GB DDR4-2666 SDRAM (1 x 4 GB)\n" +
                "256GB SATA HDD\n" +
                "Dependable power. Designed to go.\n" +
                "AMD Radeon™ 620 Graphics (2 GB GDDR5 dedicated)\n" +
                "1 SuperSpeed USB Type-C® 5Gbps signaling rate; 2 SuperSpeed USB Type-A 5Gbps signaling rate; 1 HDMI 1.4b; 1 RJ-45; 1 AC smart pin; 1 headphone/microphone combo\n" +
                "Up to 7 hours and 15 minutes", R.drawable.l_hp));
        laptops.add(new Laptop("Assus", "Intel", "Asus TUF FA506IC-R735B6T-O Gaming Laptop [AMD 8 Core Ryzen 7-4800H/ RTX3050-4GB/ 8GB/ 512GB SSD/ Win10/ 15.6\" Slim IPS FHD/ 144Hz/ Microsoft Office]\n" +
                "ASUS TUF Gaming A15 FA506: Laptop Gaming Bertenaga dengan AMD Ryzen Terbaru ASUS TUF Gaming A15 FA506 merupakan laptop gaming yang memiliki performa dan juga durabilitas tinggi.\n" +
                "\n" +
                "Laptop ini sangat cocok untuk gamers profesional yang ingin memenangkan pertandingan. Kemudian, laptop ASUS TUF Gaming A15 memiliki ukuran 359.8 x 256 x 22.8 mm dan berat sekitar 2.3 Kg.\n" +
                "\n" +
                "Laptop ini hadir dengan sasis yang lebih ringan dan ringkas dibandingkan dengan seri pendahulunya. Tak hanya itu saja, ASUS TUF Gaming A15 FX506 dibekali dengan baterai besar yang bertujuan agar Anda dapat menggunakan laptop ini untuk waktu yang lama yakni hingga mencapai 8.7 jam. Meskipun performanya kencang, laptop ini tetap tampil estetis. Laptop gaming ASUS ini tampil sangat elegan dan juga sleek.\n" +
                "\n" +
                "Kelebihan Laptop ASUS TUF Gaming A15 FA506 Ditenagai prosesor AMD Ryzen generasi terbaru. Chip grafis NVIDIA GeForce RTX 3050 yang mampu memberikan performa gaming optimal. Layar 15.6 inci FHD dengan refresh rate 144 Hz. Lolos uji standar militer. Sistem pendingin yang memastikan performa tingginya dapat terjaga." +
                "Tambahkan air soda di atasnya. Beri potongan jeruk nipis. Sajikan.", R.drawable.l_assus));
        return laptops;
    }

    private static List<Televisi> initIndonesianFoos(Context ctx) {
        List<Televisi> televisis = new ArrayList<>();
        televisis.add(new Televisi("LG", "Smart TV", " Display : 43 Inch FullHD\n" +
                "• TV Type : Smart TV\n" +
                "• Resolution : 1920 x 1080p\n" +
                "• Processor : Quad-Core\n" +
                "• Active HDR : Yes", R.drawable.t_lg));
        televisis.add(new Televisi("Politron", "TV Led", "• TV LED\n" +
                "• Didesain slim\n" +
                "• Layar : 32 Inch\n" +
                "• Resolusi : HD ready\n" +
                "• Port : 3 port HDMI dan slot USB 2.0", R.drawable.t_poloytron));
        televisis.add(new Televisi("Toshiba", "Tv LED", "Ukuran Layar : 43 Inch\n" +
                "Resolusi Layar : FHD\n" +
                "Speaker Output : 8W + 8W\n" +
                "Dolby Version : Dolby Digital Plus\n" +
                "Konsumsi Daya : 60 Watt", R.drawable.t_toshiba));
        return televisis;
    }


    private static void initAllElektronik(Context ctx) {
        elektroniks.addAll(initCoktail(ctx));
        elektroniks.addAll(initMocktail(ctx));
        elektroniks.addAll(initIndonesianFoos(ctx));
    }


    public static List<Elektronik> getElektroniksByTipe(Context ctx, String jenis) {
        List<Elektronik> elektroniksByType = new ArrayList<>();
        if (elektroniks.size() == 0) {
            initAllElektronik(ctx);
        }
        for (Elektronik h : elektroniks) {
            if (h.getElektronik().equals(jenis)) {
                elektroniksByType.add(h);
            }
        }
        return elektroniksByType;
    }
}
