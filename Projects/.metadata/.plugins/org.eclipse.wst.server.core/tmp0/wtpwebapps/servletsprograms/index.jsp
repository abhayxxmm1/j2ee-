<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Welcome Dots Animation</title>
  <link href="https://fonts.googleapis.com/css?family=Montserrat:700&display=swap" rel="stylesheet">
  <style>
    .welcome-animation {
      position: relative;
      width: 350px;
      height: 100px;
      margin: 60px auto;
      display: flex;
      align-items: center;
      justify-content: center;
      background: #f8f8fa;
      border-radius: 16px;
      box-shadow: 0 8px 28px rgba(33, 150, 243, 0.07);
    }
    .dot {
      position: absolute;
      width: 14px;
      height: 14px;
      border-radius: 50%;
      background: #3498db;
      opacity: 0.8;
      animation: bounce-dot 1.5s cubic-bezier(.73,.02,.31,.84) infinite;
      animation-delay: calc(var(--i) * 0.2s);
    }
    .dot:nth-child(1) { left: 30px; top: 60px; }
    .dot:nth-child(2) { left: 90px; top: 30px; }
    .dot:nth-child(3) { left: 150px; top: 80px; }
    .dot:nth-child(4) { left: 210px; top: 40px; }
    .dot:nth-child(5) { left: 270px; top: 60px; }
    .dot:nth-child(6) { left: 330px; top: 30px; }
    .dot:nth-child(7) { left: 70px; top: 80px; }

    @keyframes bounce-dot {
      0%,100% { transform: translateY(0);}
      20% { transform: translateY(-40px);}
      35% { transform: translateY(0);}
      60% { opacity: 0;}
    }

    .welcome-text {
      position: absolute;
      left: 50%;
      top: 50%;
      transform: translate(-50%,-50%);
      font-family: 'Montserrat', Arial, sans-serif;
      font-size: 3em;
      color: #3498db;
      letter-spacing: 0.15em;
      opacity: 0;
      animation: revealText 2s 1.6s forwards;
    }
    @keyframes revealText {
      from { opacity: 0; }
      to { opacity: 1; }
    }
  </style>
</head>
<body>
  <div class="welcome-animation">
    <span class="dot" style="--i:0"></span>
    <span class="dot" style="--i:1"></span>
    <span class="dot" style="--i:2"></span>
    <span class="dot" style="--i:3"></span>
    <span class="dot" style="--i:4"></span>
    <span class="dot" style="--i:5"></span>
    <span class="dot" style="--i:6"></span>
    <span class="welcome-text">WELCOME</span>
  </div>
</body>
</html>
