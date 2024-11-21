import React from 'react';
import Illustration from '../components/Illustration';
import SmallSocialButton from '../components/SmallSocialButton';
import TextLink from '../components/TextLink';

export function Footer() {
  const footer = {
    copyrightSignSrc: '/img/copyright-image.svg',
    year: new Date().getFullYear(),
    links: [
      {
        text: 'Home',
        href: '/',
      },
    ],
    socialText: 'Connect with us',
    socialButtons: [],
    isLegal: false,
  };

  return (
    <footer>
      <div className="pt-12 tablet:pt-14 desktop:pt-18 pb-14 desktop:pb-24 max-w-container desktop:mx-auto">
        <div className="relative h-auto overflow-hidden invertDarkMode bg-primary-yellow p-0.5">
          <Illustration
            className="relative h-[14px] w-full"
            imgStyle="absolute top-0 left-0 bottom-0 m-auto object-cover max-h-full max-w-full min-h-full min-w-full"
            img="/img/marquee-d-1440.svg"
            accentClass="tbd-white-illustration"
            alt=""
          />
        </div>

        <div className="flex h-[116px] tablet:h-[132px] desktop:h-[236px] items-center text-primary-black px-4 tablet:px-6 desktop:px-12 bg-primary-yellow">
          <div className="flex items-center align-middle">
            <span className="mr-1 tablet:mr-3">
              <Illustration
                className="relative w-[50px] h-[50px]"
                img={footer.logoSrc}
                alt="TBD"
              />
            </span>
            <span className="mx-3">
              <Illustration
                className="relative h-[84px] w-[84px] desktop:w-[140px] desktop:h-[140px] "
                img={footer.copyrightSignSrc}
                alt="copyright"
              />
            </span>
            <span className="copy">{footer.year}</span>
          </div>
          <ul className="flex justify-end flex-auto flex-wrap lg:flex-nowrap nav-links">
            {footer.links &&
              footer.links.map((link, index) => (
                <li key={index} className="ml-8 lg:ml-12 flex items-center py-0 mx-auto lg:mx-0">
                  <TextLink
                    className="py-0 text-primary-black hover:text-primary-black hoverLink"
                    href={link.href}
                    text={link.text}
                  />
                </li>
              ))}
          </ul>
        </div>
        <div className="flex flex-col bg-black mt-9 tablet:h-18 desktop:h-32 tablet:px-6 desktop:px-12 tablet:mt-0 tablet:flex-row tablet:items-center desktop:flex-row">
          <div className="flex-1">
            <p className={'copy text-primary-yellow'}>{footer.socialText}</p>
          </div>
          <div className="flex-1 block h-full tablet:flex tablet:justify-end">
            <div className="grid grid-cols-4 my-10 place-items-center gap-9 tablet:gap-3 desktop:gap-6 tablet:my-0 tablet:flex tablet:justify-end">
              {footer.socialButtons.map((socialButton, idx) => (
                <SmallSocialButton
                  key={`sb-${idx}`}
                  src={socialButton.src}
                  url={socialButton.url}
                  altText={socialButton.altText}
                  title={socialButton.title}
                  isBlackWhite={false}
                />
              ))}
            </div>
          </div>
        </div>
        <div
      
          className="bg-repeat-x h-6"
        ></div>
      </div>
    </footer>
  );
}

export default Footer;
