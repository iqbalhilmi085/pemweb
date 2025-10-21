<!DOCTYPE html>
<html lang="id">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Halaman Responsif Bootstrap</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" rel="stylesheet">
  <style>
    body {
      background: linear-gradient(to right, #f8f9fa, #e9ecef);
      font-family: 'Segoe UI', sans-serif;
    }
    .navbar {
      box-shadow: 0 4px 6px rgba(0,0,0,0.1);
    }
    .hero {
      background-image: url('https://source.unsplash.com/1600x400/?technology,abstract');
      background-size: cover;
      background-position: center;
      color: white;
      padding: 80px 20px;
      text-align: center;
    }
    .hero h1 {
      font-size: 3rem;
      font-weight: bold;
      text-shadow: 2px 2px 4px rgba(0,0,0,0.5);
    }
    .info-box {
      transition: transform 0.3s ease;
    }
    .info-box:hover {
      transform: translateY(-5px);
    }
    footer {
      background-color: #343a40;
      color: #ccc;
    }
  </style>
</head>
<body>

  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
      <a class="navbar-brand" href="#"><i class="fas fa-broadcast-tower me-2"></i>Multimedia Site</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item"><a class="nav-link active" href="#">Beranda</a></li>
          <li class="nav-item"><a class="nav-link" href="#">Tentang</a></li>
          <li class="nav-item"><a class="nav-link" href="#">Kontak</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Hero Section -->
  <div class="hero">
    <h1>Selamat Datang di Dunia Multimedia</h1>
    <p class="lead">Eksplorasi teknologi, kreativitas, dan komunikasi visual</p>
  </div>

  <!-- Konten Utama -->
  <div class="container my-5">
    <div class="row">
      <div class="col-md-6 mb-4">
        <div class="info-box p-4 bg-white rounded shadow-sm">
          <h3><i class="fas fa-info-circle me-2 text-primary"></i>Informasi A</h3>
          <p>Konten ini cocok untuk deskripsi produk, artikel, atau informasi umum. Gunakan ruang ini untuk menyampaikan pesan utama dengan gaya yang menarik.</p>
          <a href="#" class="btn btn-outline-primary btn-sm">Selengkapnya</a>
        </div>
      </div>
      <div class="col-md-6 mb-4">
        <div class="info-box p-4 bg-white rounded shadow-sm">
          <h3><i class="fas fa-newspaper me-2 text-success"></i>Informasi B</h3>
          <p>Bagian ini bisa digunakan untuk berita terbaru, galeri, atau testimonial. Tambahkan elemen visual atau tautan untuk memperkaya pengalaman pengguna.</p>
          <a href="#" class="btn btn-outline-success btn-sm">Lihat Detail</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Footer -->
  <footer class="text-center py-4">
    <div class="container">
      <p>&copy; 2025 Multimedia Site. Dibuat dengan ❤️ oleh Tim Kreatif.</p>
      <div>
        <a href="#" class="text-light me-3"><i class="fab fa-facebook-f"></i></a>
        <a href="#" class="text-light me-3"><i class="fab fa-twitter"></i></a>
        <a href="#" class="text-light"><i class="fab fa-instagram"></i></a>
      </div>
    </div>
  </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
