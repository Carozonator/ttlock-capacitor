
  Pod::Spec.new do |s|
    s.name = 'TtlockCapacitor'
    s.version = '0.0.1'
    s.summary = 'Capacitor plugin for ttlock'
    s.license = 'MIT'
    s.homepage = 'https://github.com/Carozonator/ttlock-capacitor.git'
    s.author = 'Julio Carozo'
    s.source = { :git => 'https://github.com/Carozonator/ttlock-capacitor.git', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end